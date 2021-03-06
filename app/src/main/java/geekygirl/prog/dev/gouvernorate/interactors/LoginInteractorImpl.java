package geekygirl.prog.dev.gouvernorate.interactors;

import android.os.Handler;
import android.text.TextUtils;

import geekygirl.prog.dev.gouvernorate.ui.login.OnLoginFinishedListener;


public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {

                    if (username.equals("admin") && password.equals("admin")) {
                        listener.onSuccess();
                    } else {
                        listener.onError();
                    }
                }
            }
        }, 2000);
    }
}
