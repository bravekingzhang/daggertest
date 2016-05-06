package com.whu.hoollyzhang.daggertest;

import dagger.Component;

/**
 * Created by hoollyzhang on 16/5/6.
 * Description :
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
