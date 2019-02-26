package com.feihua.framework.cms.admin.rest.dto;

import java.util.Date;
import java.util.List;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_content
 *
 * @mbg.generated 2018-11-09 16:57:40
*/
public class AddCmsContentFormDto {

    private String title;

    private String author;

    private String content;

    private String status;

    private String siteId;

    private String contentType;

    private String channelId;

    private String template;

    private Date publishAt;
    private String original;
    private String profile;
    private String imageUrl;

    private String imageDes;

    List<AddCmsContentAttachmentFormDto> attachments;

    List<AddCmsContentGalleryFormDto> gallerys;

    private AddCmsContentLibraryFormDto library;

    private List<AddCmsContentLibraryImageFormDto> libraryImages;

    private AddCmsContentDownloadFormDto download;

    private List<AddCmsContentDownloadImageFormDto> downloadImages;

    private AddCmsContentAudioFormDto audio;
    private AddCmsContentVideoFormDto video;

    private List<AddCmsContentVideoOtherPlayerFormDto> videoOtherPlayer;

    List<String> categoryIds;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Date getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(Date publishAt) {
        this.publishAt = publishAt;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageDes() {
        return imageDes;
    }

    public void setImageDes(String imageDes) {
        this.imageDes = imageDes;
    }

    public List<AddCmsContentAttachmentFormDto> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AddCmsContentAttachmentFormDto> attachments) {
        this.attachments = attachments;
    }

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<AddCmsContentGalleryFormDto> getGallerys() {
        return gallerys;
    }

    public void setGallerys(List<AddCmsContentGalleryFormDto> gallerys) {
        this.gallerys = gallerys;
    }

    public AddCmsContentLibraryFormDto getLibrary() {
        return library;
    }

    public void setLibrary(AddCmsContentLibraryFormDto library) {
        this.library = library;
    }

    public AddCmsContentDownloadFormDto getDownload() {
        return download;
    }

    public void setDownload(AddCmsContentDownloadFormDto download) {
        this.download = download;
    }

    public List<AddCmsContentLibraryImageFormDto> getLibraryImages() {
        return libraryImages;
    }

    public void setLibraryImages(List<AddCmsContentLibraryImageFormDto> libraryImages) {
        this.libraryImages = libraryImages;
    }

    public AddCmsContentAudioFormDto getAudio() {
        return audio;
    }

    public void setAudio(AddCmsContentAudioFormDto audio) {
        this.audio = audio;
    }

    public AddCmsContentVideoFormDto getVideo() {
        return video;
    }

    public void setVideo(AddCmsContentVideoFormDto video) {
        this.video = video;
    }

    public List<AddCmsContentVideoOtherPlayerFormDto> getVideoOtherPlayer() {
        return videoOtherPlayer;
    }

    public void setVideoOtherPlayer(List<AddCmsContentVideoOtherPlayerFormDto> videoOtherPlayer) {
        this.videoOtherPlayer = videoOtherPlayer;
    }

    public List<AddCmsContentDownloadImageFormDto> getDownloadImages() {
        return downloadImages;
    }

    public void setDownloadImages(List<AddCmsContentDownloadImageFormDto> downloadImages) {
        this.downloadImages = downloadImages;
    }
}