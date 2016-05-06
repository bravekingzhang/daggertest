package com.whu.hoollyzhang.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hoollyzhang on 16/5/6.
 * Description :
 */
@Module
public class ActivityModule {
    @Provides
    UserModel provideUserModel(){
        UserModel userModel = new UserModel();
        userModel.setUid("sdfasdfsdfa");
        userModel.setUname("勇哥");
        return userModel;
    }
}
