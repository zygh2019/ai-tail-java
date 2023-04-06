package com.aitail.aitailweb.service.uc;

/**
 * @author liushengbin
 * @date 2023/3/31
 */
public class UgcTwoHandel extends UgcHandelAbs {

    private UgcTwoContext ugcTwoContext;

    @Override
    public BookContext coved() {
        BookContext bookContext = new BookContext();
        bookContext.setBookName(ugcTwoContext.getName());
        System.out.println("转换");
        return bookContext;
    }

    @Override
    public void beforeValid() {
        String name = ugcTwoContext.getName();

        System.out.println("前置校验");
    }

    @Override
    public void setUGCContext(UgcContext ugcContext) {
        ugcTwoContext = (UgcTwoContext) ugcContext;
    }


    @Override
    public void afterValid() {
        String name = ugcTwoContext.getName();
        System.out.println("后置校验");
    }

}
