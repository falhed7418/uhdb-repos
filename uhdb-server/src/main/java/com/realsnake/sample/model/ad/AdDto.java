/**
 * Copyright (c) 2016 realsnake1975@gmail.com
 *
 * 2016. 10. 13.
 */
package com.realsnake.sample.model.ad;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.realsnake.sample.model.common.CommonDto;

/**
 * <pre>
 * Class Name : NoticeDto.java
 * Description : NoticeDto
 *
 * Modification Information
 *
 * Mod Date         Modifier    Description
 * -----------      --------    ---------------------------
 * 2016. 10. 13.     전강욱      Generation
 * </pre>
 *
 * @author 전강욱
 * @since 2016. 10. 13.
 * @version 1.0
 */
public class AdDto extends CommonDto implements Serializable {

    /** SID */
    private static final long serialVersionUID = -7610608894365326948L;

    private SponsorVo sponsor;
    private ShopVo shop;
    private AdVo ad;

    private String uploadedFilePush;
    private String uploadedFileStart;
    private String uploadedFileEnd;
    private String uploadedFileBanner;
    private String uploadedFilePopup;

    private String userAptId;

    public SponsorVo getSponsor() {
        return sponsor;
    }

    public ShopVo getShop() {
        return shop;
    }

    public AdVo getAd() {
        return ad;
    }

    public void setSponsor(SponsorVo sponsor) {
        this.sponsor = sponsor;
    }

    public void setShop(ShopVo shop) {
        this.shop = shop;
    }

    public void setAd(AdVo ad) {
        this.ad = ad;
    }

    public String getUploadedFilePush() {
        return uploadedFilePush;
    }

    public String getUploadedFileStart() {
        return uploadedFileStart;
    }

    public String getUploadedFileEnd() {
        return uploadedFileEnd;
    }

    public String getUploadedFileBanner() {
        return uploadedFileBanner;
    }

    public String getUploadedFilePopup() {
        return uploadedFilePopup;
    }

    public void setUploadedFilePush(String uploadedFilePush) {
        this.uploadedFilePush = uploadedFilePush;
    }

    public void setUploadedFileStart(String uploadedFileStart) {
        this.uploadedFileStart = uploadedFileStart;
    }

    public void setUploadedFileEnd(String uploadedFileEnd) {
        this.uploadedFileEnd = uploadedFileEnd;
    }

    public void setUploadedFileBanner(String uploadedFileBanner) {
        this.uploadedFileBanner = uploadedFileBanner;
    }

    public void setUploadedFilePopup(String uploadedFilePopup) {
        this.uploadedFilePopup = uploadedFilePopup;
    }

    public String getUserAptId() {
        return userAptId;
    }

    public void setUserAptId(String userAptId) {
        this.userAptId = userAptId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

}
