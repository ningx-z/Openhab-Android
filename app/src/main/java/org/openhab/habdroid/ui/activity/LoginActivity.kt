package org.openhab.habdroid.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.litepal.LitePal
import org.litepal.extension.findFirstAsync
import org.openhab.habdroid.R
import org.openhab.habdroid.core.OpenHabApplication
import org.openhab.habdroid.model.UserInfo
import org.openhab.habdroid.ui.MainActivity
import org.openhab.habdroid.util.SharedPreferencesUtil
import org.openhab.habdroid.util.showToast

/**
 * @Author： zy
 * @Date： 2020/6/20 10:26 AM
 * @Description：
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvUsername.setText(SharedPreferencesUtil.getData("userName", "") as String)
        tvPassword.setText(SharedPreferencesUtil.getData("pwd", "") as String)

        tvTem.setText(SharedPreferencesUtil.getData("tem", "") as String)
        tvHum.setText(SharedPreferencesUtil.getData("hum", "") as String)

        mBtnLogin.setOnClickListener {
            val userName = tvUsername.text.toString().trim()
            val pwd = tvPassword.text.toString().trim()
            if (userName.isEmpty() || pwd.isEmpty()) {
                showToast("用户名或密码不能为空")
                return@setOnClickListener
            }
            if (userName == "admin" && pwd == "admin") {
                showToast("登录成功")
                val userInfo = UserInfo()
                userInfo.userName = "admin"
                userInfo.password = "admin"
                OpenHabApplication.userInfo = userInfo
                SharedPreferencesUtil.putData("userName", userName)
                SharedPreferencesUtil.putData("pwd", pwd)
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                LitePal.where("userName = ?", userName).findFirstAsync<UserInfo>()
                    .listen { userInfo ->
                        if (userInfo == null || userInfo.password != pwd) {
                            showToast("用户名或密码错误")
                            return@listen
                        }
                        SharedPreferencesUtil.putData("userName", userName)
                        SharedPreferencesUtil.putData("pwd", pwd)
                        OpenHabApplication.userInfo = userInfo
                        showToast("登录成功")
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    }
            }
        }

        mBtnSignIn.setOnClickListener {
            val userName = tvUsername.text.toString().trim()
            val pwd = tvPassword.text.toString().trim()
            if (userName.isEmpty() || pwd.isEmpty()) {
                showToast("用户名或密码不能为空")
                return@setOnClickListener
            }
            if (userName != "admin" || pwd != "admin") {
                showToast("管理员用户名或密码错误")
                return@setOnClickListener
            }
            startActivity(Intent(this, RegActivity::class.java))
        }

        mBtnSave.setOnClickListener {
            val tem = tvTem.text.toString().trim()
            val hum = tvHum.text.toString().trim()
            SharedPreferencesUtil.putData("tem", tem)
            SharedPreferencesUtil.putData("hum", hum)
            showToast("保存成功")
        }
    }

}