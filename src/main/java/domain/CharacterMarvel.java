package domain;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "description",
        "modified",
        "resourceURI",
        "urls",
        "thumbnail",
        "comics",
        "stories",
        "events",
        "series"
})
public class CharacterMarvel {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("resourceURI")
    private String resourceURI;
    @JsonProperty("urls")
    private List<Url> urls = new ArrayList<Url>();
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
    @JsonProperty("comics")
    private Comics comics;
    @JsonProperty("stories")
    private Stories stories;
    @JsonProperty("events")
    private Events events;
    @JsonProperty("series")
    private Series series;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The modified
     */
    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The resourceURI
     */
    @JsonProperty("resourceURI")
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     *
     * @param resourceURI
     * The resourceURI
     */
    @JsonProperty("resourceURI")
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    /**
     *
     * @return
     * The urls
     */
    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     * The urls
     */
    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    /**
     *
     * @return
     * The thumbnail
     */
    @JsonProperty("thumbnail")
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     * The thumbnail
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     *
     * @return
     * The comics
     */
    @JsonProperty("comics")
    public Comics getComics() {
        return comics;
    }

    /**
     *
     * @param comics
     * The comics
     */
    @JsonProperty("comics")
    public void setComics(Comics comics) {
        this.comics = comics;
    }

    /**
     *
     * @return
     * The stories
     */
    @JsonProperty("stories")
    public Stories getStories() {
        return stories;
    }

    /**
     *
     * @param stories
     * The stories
     */
    @JsonProperty("stories")
    public void setStories(Stories stories) {
        this.stories = stories;
    }

    /**
     *
     * @return
     * The events
     */
    @JsonProperty("events")
    public Events getEvents() {
        return events;
    }

    /**
     *
     * @param events
     * The events
     */
    @JsonProperty("events")
    public void setEvents(Events events) {
        this.events = events;
    }

    /**
     *
     * @return
     * The series
     */
    @JsonProperty("series")
    public Series getSeries() {
        return series;
    }

    /**
     *
     * @param series
     * The series
     */
    @JsonProperty("series")
    public void setSeries(Series series) {
        this.series = series;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}