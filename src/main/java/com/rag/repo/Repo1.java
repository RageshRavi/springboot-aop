package com.rag.repo;

import org.springframework.stereotype.Repository;

/**
 * Created by Ragesh on 2/3/2019.
 */
@Repository
public class Repo1 {

    public String callMe(String s1){
        return "Inside Repo1 callMe()";
    }
}
