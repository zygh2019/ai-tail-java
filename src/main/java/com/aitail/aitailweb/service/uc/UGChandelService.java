package com.aitail.aitailweb.service.uc;

/**
 * @author liushengbin
 * @date 2023/3/31
 */
public class UGChandelService {


    public void test() {


    }

    public static void main(String[] args) {
        UgcTwoHandel ugcOneHandel = new UgcTwoHandel();
        UgcTwoContext ugcTwoContext = new UgcTwoContext();
        ugcTwoContext.setName("123");
        //设置上下文
        ugcOneHandel.setUGCContext(ugcTwoContext);
        //执行
        ugcOneHandel.execute();
    }
}
