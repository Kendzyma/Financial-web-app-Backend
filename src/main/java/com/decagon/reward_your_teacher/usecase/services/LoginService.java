package com.decagon.reward_your_teacher.usecase.services;

import com.decagon.reward_your_teacher.usecase.payload.request.LoginRequest;
import com.decagon.reward_your_teacher.usecase.payload.request.SocialLoginRequest;
import com.decagon.reward_your_teacher.usecase.payload.response.LoginResponse;

public interface LoginService {
    LoginResponse loginStudent(LoginRequest loginRequest);

    LoginResponse studentSocialLogin(SocialLoginRequest socialLoginRequest);

    LoginResponse loginTeacher(LoginRequest loginRequest);

    LoginResponse teacherSocialLogin(SocialLoginRequest socialLoginRequest);
}
