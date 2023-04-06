package com.aitail.aitailweb.service.uc;

/**
 * @author liushengbin
 * @date 2023/3/31
 */
public interface UgcHanderInfa {
    BookContext coved();

    void beforeValid();

    void execute();

    void setUGCContext(UgcContext ugcContext);

    void afterValid();
}
