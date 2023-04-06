package com.aitail.aitailweb.service.uc;

/**
 * @author liushengbin
 * @date 2023/3/31
 */
public abstract class UgcHandelAbs implements UgcHanderInfa {


    @Override
    public void execute() {
        beforeValid();
        afterValid();
        BookContext coved = coved();
        System.out.println(coved);

    }
}
