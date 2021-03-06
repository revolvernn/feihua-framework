package com.feihua.framework.cms.dto;

import com.feihua.framework.cms.CmsConstants;
import com.feihua.framework.cms.po.CmsContentAttachmentPo;
import com.feihua.utils.io.FileUtils;
import feihua.jdbc.api.pojo.BaseDto;

import java.util.Date;
import java.util.List;

import static com.feihua.framework.cms.CmsConstants.*;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_content
 *
 * @mbg.generated 2018-11-19 15:49:53
*/
public class CmsContentTemplateModelDto extends BaseDto {

    public CmsContentTemplateModelDto(CmsContentDto contentDto,CmsTemplateModelContextDto contextDto) {
        this.id = contentDto.getId();
        this.title = contentDto.getTitle();
        this.author = contentDto.getAuthor();
        this.status = contentDto.getStatus();
        this.siteId = contentDto.getSiteId();
        this.channelId = contentDto.getChannelId();
        this.contentType = contentDto.getContentType();
        this.template = contentDto.getTemplate();
        this.pv = contentDto.getPv();
        this.iv = contentDto.getIv();
        this.uv = contentDto.getUv();
        this.dataUserId = contentDto.getDataUserId();
        this.dataOfficeId = contentDto.getDataOfficeId();
        this.dataType = contentDto.getDataType();
        this.dataAreaId = contentDto.getDataAreaId();
        this.delFlag = contentDto.getDelFlag();
        this.createAt = contentDto.getCreateAt();
        this.createBy = contentDto.getCreateBy();
        this.updateAt = contentDto.getUpdateAt();
        this.updateBy = contentDto.getUpdateBy();
        this.content = contentDto.getContent();
        this.publishAt = contentDto.getPublishAt();
        this.original = contentDto.getOriginal();
        this.profile = contentDto.getProfile();
        this.imageDes = contentDto.getImageDes();
        this.imageUrl = contentDto.getImageUrl();

        this.contextDto = contextDto;
    }
    public CmsContentTemplateModelDto(CmsContentDto contentDto,CmsChannelTemplateModelDto channel,CmsTemplateModelContextDto contextDto) {
        this( contentDto, contextDto);
        this.channel = channel;
    }
    private String id;

    private String title;

    private String author;

    private String status;

    private String siteId;

    private String channelId;
    private String contentType;
    private String template;

    private Integer pv;

    private Integer iv;

    private Integer uv;

    private String dataUserId;

    private String dataOfficeId;

    private String dataType;

    private String dataAreaId;

    private String delFlag;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    private String content;

    private String profile;

    private String original;

    private Date publishAt;

    private String imageUrl;

    private String imageDes;

    private CmsTemplateModelContextDto contextDto;
    private CmsChannelTemplateModelDto channel;
    private List<CmsContentAttachmentDto> attachments;
    private CmsContentAudioDto audio;
    private CmsContentVideoDto video;
    private List<CmsContentVideoOtherPlayerDto> videoOtherPlayers;
    private List<CmsContentGalleryDto> gallerys;
    private CmsContentLibraryDto library;
    private List<CmsContentLibraryImageDto> libraryImages;
    private CmsContentDownloadDto download;
    private List<CmsContentDownloadImageDto> downloadImages;

    // addtional
    public String getContentPath() {
        return requestContentPathPrefix + FileUtils.slash +  this.id;

    }

    public List<CmsContentVideoOtherPlayerDto> getVideoOtherPlayers() {
        return videoOtherPlayers;
    }

    public void setVideoOtherPlayers(List<CmsContentVideoOtherPlayerDto> videoOtherPlayers) {
        this.videoOtherPlayers = videoOtherPlayers;
    }

    public String getSuffix() {
        return contextDto.isDynamic() ? suffixHtm : suffixHtml;
    }

    public String getContentUrl(){
        return getContentPath() + getSuffix();
    }
    public CmsTemplateModelContextDto getContextDto() {
        return contextDto;
    }

    public void setContextDto(CmsTemplateModelContextDto contextDto) {
        this.contextDto = contextDto;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getIv() {
        return iv;
    }

    public void setIv(Integer iv) {
        this.iv = iv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public String getDataUserId() {
        return dataUserId;
    }

    public void setDataUserId(String dataUserId) {
        this.dataUserId = dataUserId;
    }

    public String getDataOfficeId() {
        return dataOfficeId;
    }

    public void setDataOfficeId(String dataOfficeId) {
        this.dataOfficeId = dataOfficeId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataAreaId() {
        return dataAreaId;
    }

    public void setDataAreaId(String dataAreaId) {
        this.dataAreaId = dataAreaId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CmsChannelTemplateModelDto getChannel() {
        return channel;
    }

    public void setChannel(CmsChannelTemplateModelDto channel) {
        this.channel = channel;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public Date getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(Date publishAt) {
        this.publishAt = publishAt;
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

    public List<CmsContentAttachmentDto> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<CmsContentAttachmentDto> attachments) {
        this.attachments = attachments;
    }

    public CmsContentAudioDto getAudio() {
        return audio;
    }

    public void setAudio(CmsContentAudioDto audio) {
        this.audio = audio;
    }

    public CmsContentVideoDto getVideo() {
        return video;
    }

    public void setVideo(CmsContentVideoDto video) {
        this.video = video;
    }

    public List<CmsContentGalleryDto> getGallerys() {
        return gallerys;
    }

    public void setGallerys(List<CmsContentGalleryDto> gallerys) {
        this.gallerys = gallerys;
    }

    public CmsContentLibraryDto getLibrary() {
        return library;
    }

    public void setLibrary(CmsContentLibraryDto library) {
        this.library = library;
    }

    public List<CmsContentLibraryImageDto> getLibraryImages() {
        return libraryImages;
    }

    public void setLibraryImages(List<CmsContentLibraryImageDto> libraryImages) {
        this.libraryImages = libraryImages;
    }

    public CmsContentDownloadDto getDownload() {
        return download;
    }

    public void setDownload(CmsContentDownloadDto download) {
        this.download = download;
    }

    public List<CmsContentDownloadImageDto> getDownloadImages() {
        return downloadImages;
    }

    public void setDownloadImages(List<CmsContentDownloadImageDto> downloadImages) {
        this.downloadImages = downloadImages;
    }
}