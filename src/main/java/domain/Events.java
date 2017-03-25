package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "available",
        "collectionURI",
        "items",
        "returned"
})
public class Events {

    @JsonProperty("available")
    private Integer available;
    @JsonProperty("collectionURI")
    private String collectionURI;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("returned")
    private Integer returned;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The available
     */
    @JsonProperty("available")
    public Integer getAvailable() {
        return available;
    }

    /**
     *
     * @param available
     * The available
     */
    @JsonProperty("available")
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     *
     * @return
     * The collectionURI
     */
    @JsonProperty("collectionURI")
    public String getCollectionURI() {
        return collectionURI;
    }

    /**
     *
     * @param collectionURI
     * The collectionURI
     */
    @JsonProperty("collectionURI")
    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    /**
     *
     * @return
     * The Items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param Items
     * The Items
     */
    @JsonProperty("Items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     *
     * @return
     * The returned
     */
    @JsonProperty("returned")
    public Integer getReturned() {
        return returned;
    }

    /**
     *
     * @param returned
     * The returned
     */
    @JsonProperty("returned")
    public void setReturned(Integer returned) {
        this.returned = returned;
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