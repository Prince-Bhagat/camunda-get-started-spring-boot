package org.camunda.bpm.getstarted.loanapproval.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int someVarible = Integer.valueOf((String) delegateExecution.getVariable("someVariable"));
        someVarible = someVarible + 10;
        delegateExecution.setVariable("someVariable",someVarible);
        Map<String,Object> variables = delegateExecution.getVariables();
        System.out.println("PRINTING LOG");
        System.out.println(variables);
    }
}
