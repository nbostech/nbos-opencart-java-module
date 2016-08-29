package com.nbos.capi.modules.opencart.v0.models.products;

import java.util.List;

/**
 * Created by vivekkiran on 8/6/16.
 */

public class ProductsData {
    private String id;
    private String seo_h1;
    private String name;
    private String manufacturer;

    public String getSku() {
        return sku;
    }

    public String getId() {
        return id;
    }

    public String getSeo_h1() {
        return seo_h1;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getImage() {
        return image;
    }

    public List<Object> getImages() {
        return images;
    }

    public String getOriginal_image() {
        return original_image;
    }

    public List<Object> getOriginal_images() {
        return original_images;
    }

    public String getPrice() {
        return price;
    }

    public String getPrice_formated() {
        return price_formated;
    }

    public Long getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public List<Object> getAttribute_groups() {
        return attribute_groups;
    }

    public String getSpecial() {
        return special;
    }

    public String getSpecial_formated() {
        return special_formated;
    }

    public String getSpecial_start_date() {
        return special_start_date;
    }

    public String getSpecial_end_date() {
        return special_end_date;
    }

    public List<Object> getDiscounts() {
        return discounts;
    }

    public List<OptionsListModel> getOptions() {
        return options;
    }

    public String getMinimum() {
        return minimum;
    }

    public String getMeta_title() {
        return meta_title;
    }

    public String getMeta_description() {
        return meta_description;
    }

    public String getMeta_keyword() {
        return meta_keyword;
    }

    public String getTag() {
        return tag;
    }

    public String getUpc() {
        return upc;
    }

    public String getEan() {
        return ean;
    }

    public String getJan() {
        return jan;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getMpn() {
        return mpn;
    }

    public String getLocation() {
        return location;
    }

    public String getStock_status() {
        return stock_status;
    }

    public Object getManufacturer_id() {
        return manufacturer_id;
    }

    public String getTax_class_id() {
        return tax_class_id;
    }

    public String getDate_available() {
        return date_available;
    }

    public String getWeight() {
        return weight;
    }

    public String getWeight_class_id() {
        return weight_class_id;
    }

    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getLength_class_id() {
        return length_class_id;
    }

    public String getSubtract() {
        return subtract;
    }

    public String getSort_order() {
        return sort_order;
    }

    public String getStatus() {
        return status;
    }

    public String getDate_added() {
        return date_added;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public String getViewed() {
        return viewed;
    }

    public String getWeight_class() {
        return weight_class;
    }

    public String getLength_class() {
        return length_class;
    }

    public Object getReward() {
        return reward;
    }

    public String getPoints() {
        return points;
    }

    public List<Object> getCategory() {
        return category;
    }

    public String getQuantity() {
        return quantity;
    }

    public ReviewsModel getReviews() {
        return reviews;
    }

    private String sku;
    private String model;
    private String image;
    private List<Object> images;
    private String original_image;
    private List<Object> original_images;
    private String price;
    private String price_formated;
    private Long rating;
    private String description;
    private List<Object> attribute_groups;
    private String special;
    private String special_formated;
    private String special_start_date;
    private String special_end_date;
    private List<Object> discounts;
    private List<OptionsListModel> options;
    private String minimum;
    private String meta_title;
    private String meta_description;
    private String meta_keyword;
    private String tag;
    private String upc;
    private String ean;
    private String jan;
    private String isbn;
    private String mpn;
    private String location;
    private String stock_status;
    private Object manufacturer_id;
    private String tax_class_id;
    private String date_available;
    private String weight;
    private String weight_class_id;
    private String length;
    private String width;
    private String height;
    private String length_class_id;
    private String subtract;
    private String sort_order;
    private String status;
    private String date_added;
    private String date_modified;
    private String viewed;
    private String weight_class;
    private String length_class;
    private Object reward;
    private String points;
    private List<Object> category;
    private String quantity;
    private ReviewsModel reviews;

}
