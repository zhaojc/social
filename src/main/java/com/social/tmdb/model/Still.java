
package com.social.tmdb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aspect_ratio",
    "file_path",
    "height",
    "iso_639_1",
    "vote_average",
    "vote_count",
    "width"
})
public class Still {

    @JsonProperty("aspect_ratio")
    private Double aspectRatio;
    @JsonProperty("file_path")
    private String filePath;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("iso_639_1")
    private Object iso6391;
    @JsonProperty("vote_average")
    private Integer voteAverage;
    @JsonProperty("vote_count")
    private Integer voteCount;
    @JsonProperty("width")
    private Integer width;

    /**
     * 
     * @return
     *     The aspectRatio
     */
    @JsonProperty("aspect_ratio")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    /**
     * 
     * @param aspectRatio
     *     The aspect_ratio
     */
    @JsonProperty("aspect_ratio")
    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * 
     * @return
     *     The filePath
     */
    @JsonProperty("file_path")
    public String getFilePath() {
        return filePath;
    }

    /**
     * 
     * @param filePath
     *     The file_path
     */
    @JsonProperty("file_path")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The iso6391
     */
    @JsonProperty("iso_639_1")
    public Object getIso6391() {
        return iso6391;
    }

    /**
     * 
     * @param iso6391
     *     The iso_639_1
     */
    @JsonProperty("iso_639_1")
    public void setIso6391(Object iso6391) {
        this.iso6391 = iso6391;
    }

    /**
     * 
     * @return
     *     The voteAverage
     */
    @JsonProperty("vote_average")
    public Integer getVoteAverage() {
        return voteAverage;
    }

    /**
     * 
     * @param voteAverage
     *     The vote_average
     */
    @JsonProperty("vote_average")
    public void setVoteAverage(Integer voteAverage) {
        this.voteAverage = voteAverage;
    }

    /**
     * 
     * @return
     *     The voteCount
     */
    @JsonProperty("vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * 
     * @param voteCount
     *     The vote_count
     */
    @JsonProperty("vote_count")
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
