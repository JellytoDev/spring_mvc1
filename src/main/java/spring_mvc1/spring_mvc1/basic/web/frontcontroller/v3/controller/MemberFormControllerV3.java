package spring_mvc1.spring_mvc1.basic.web.frontcontroller.v3.controller;

import spring_mvc1.spring_mvc1.basic.web.frontcontroller.ModelView;
import spring_mvc1.spring_mvc1.basic.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
