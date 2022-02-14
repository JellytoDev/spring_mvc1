package spring_mvc1.spring_mvc1.basic.web.frontcontroller.v3;

import spring_mvc1.spring_mvc1.basic.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
