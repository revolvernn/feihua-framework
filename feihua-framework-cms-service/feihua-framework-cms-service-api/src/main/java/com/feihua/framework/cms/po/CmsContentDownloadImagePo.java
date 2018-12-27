package com.feihua.framework.cms.po;

import feihua.jdbc.api.pojo.BasePo;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-12-26 09:44:06
 * Database Table Remarks:
 *   内容下载图片表
 *
 * This class corresponds to the database table cms_content_download_image
 * @mbg.generated do_not_delete_during_merge 2018-12-26 09:44:06
*/
public class CmsContentDownloadImagePo extends feihua.jdbc.api.pojo.BasePo<String> {
    /**
     * Database Column Remarks:
     *   站点id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.SITE_ID
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private String siteId;

    /**
     * Database Column Remarks:
     *   内容id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.CONTENT_ID
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private String contentId;

    /**
     * Database Column Remarks:
     *   下载id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.DOWNLOAD_ID
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private String downloadId;

    /**
     * Database Column Remarks:
     *   图片url
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.IMAGE_URL
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private String imageUrl;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.IMAGE_THUMBNAIL_URL
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private String imageThumbnailUrl;

    /**
     * Database Column Remarks:
     *   图片描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.IMAGE_DES
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private String imageDes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_content_download_image.SEQUENCE
     *
     * @mbg.generated 2018-12-26 09:44:06
     */
    private Integer sequence;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
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

    public com.feihua.framework.cms.api.ApiCmsContentDownloadImagePoService service() {
        return com.feihua.utils.spring.SpringContextHolder.getBean(com.feihua.framework.cms.api.ApiCmsContentDownloadImagePoService.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siteId=").append(siteId);
        sb.append(", contentId=").append(contentId);
        sb.append(", downloadId=").append(downloadId);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", imageThumbnailUrl=").append(imageThumbnailUrl);
        sb.append(", imageDes=").append(imageDes);
        sb.append(", sequence=").append(sequence);
        sb.append("]");
        return sb.toString();
    }
}