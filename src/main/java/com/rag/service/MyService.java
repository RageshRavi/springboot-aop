package com.rag.service;

import com.rag.repo.Repo1;
import com.rag.repo.Repo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ragesh on 2/3/2019.
 */
@Component
public class MyService {

    @Autowired
    private Repo1 repo1Obj;
    @Autowired
    private Repo2 repo2Obj;

    public void callMe(){
        System.out.println(repo1Obj.callMe("Ragesh"));
    }
}
