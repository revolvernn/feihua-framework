package com.feihua.framework.cms.admin.rest.dto;

import com.feihua.framework.rest.dto.UpdateFormDto;

/**
 * This class corresponds to the database table cms_content_download_image
 * 2018-12-07 09:19:31
*/
public class UpdateCmsContentLibraryImageFormDto extends UpdateFormDto {

    private String id;
    private String imageUrl;
    private String imageThumbnailUrl;

    private String imageDes;

    private Integer sequence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageThumbnailUrl() {
        return imageThumbnailUrl;
    }

    public void setImageThumbnailUrl(String imageThumbnailUrl) {
        this.imageThumbnailUrl = imageThumbnailUrl;
    }

    public String getImageDes() {
        return imageDes;
    }

    public void setImageDes(String imageDes) {
        this.imageDes = imageDes;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}