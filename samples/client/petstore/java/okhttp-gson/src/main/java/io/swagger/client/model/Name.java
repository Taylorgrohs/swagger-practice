package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;


/**
 * Model for testing model name same as property name
 */
@ApiModel(description = "Model for testing model name same as property name")
public class Name   {
    @SerializedName("name")
    private Integer name = null;
    @SerializedName("snake_case")
    private Integer snakeCase = null;
    @SerializedName("property")
    private String property = null;
    @SerializedName("123Number")
    private Integer _123Number = null;

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name name
     */
    public void setName(Integer name) {
        this.name = name;
    }

    /**
     * Get snakeCase
     * @return snakeCase
     **/
    @ApiModelProperty(value = "")
    public Integer getSnakeCase() {
        return snakeCase;
    }

    /**
     * Get property
     * @return property
     **/
    @ApiModelProperty(value = "")
    public String getProperty() {
        return property;
    }

    /**
     * Set property
     *
     * @param property property
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Get _123Number
     * @return _123Number
     **/
    @ApiModelProperty(value = "")
    public Integer get123Number() {
        return _123Number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name = (Name) o;
        return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123Number, name._123Number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, snakeCase, property, _123Number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Name {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    _123Number: ").append(toIndentedString(_123Number)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o Object to be converted to indented string
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

