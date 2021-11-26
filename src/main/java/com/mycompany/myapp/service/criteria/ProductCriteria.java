package com.mycompany.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LocalDateFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.Product} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.ProductResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /products?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class ProductCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter title;

    private StringFilter keywords;

    private StringFilter description;

    private IntegerFilter rating;

    private LocalDateFilter dateAdded;

    private LocalDateFilter dateModified;

    private LongFilter categoryId;

    private Boolean distinct;

    public ProductCriteria() {}

    public ProductCriteria(ProductCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.title = other.title == null ? null : other.title.copy();
        this.keywords = other.keywords == null ? null : other.keywords.copy();
        this.description = other.description == null ? null : other.description.copy();
        this.rating = other.rating == null ? null : other.rating.copy();
        this.dateAdded = other.dateAdded == null ? null : other.dateAdded.copy();
        this.dateModified = other.dateModified == null ? null : other.dateModified.copy();
        this.categoryId = other.categoryId == null ? null : other.categoryId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public ProductCriteria copy() {
        return new ProductCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public StringFilter title() {
        if (title == null) {
            title = new StringFilter();
        }
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public StringFilter getKeywords() {
        return keywords;
    }

    public StringFilter keywords() {
        if (keywords == null) {
            keywords = new StringFilter();
        }
        return keywords;
    }

    public void setKeywords(StringFilter keywords) {
        this.keywords = keywords;
    }

    public StringFilter getDescription() {
        return description;
    }

    public StringFilter description() {
        if (description == null) {
            description = new StringFilter();
        }
        return description;
    }

    public void setDescription(StringFilter description) {
        this.description = description;
    }

    public IntegerFilter getRating() {
        return rating;
    }

    public IntegerFilter rating() {
        if (rating == null) {
            rating = new IntegerFilter();
        }
        return rating;
    }

    public void setRating(IntegerFilter rating) {
        this.rating = rating;
    }

    public LocalDateFilter getDateAdded() {
        return dateAdded;
    }

    public LocalDateFilter dateAdded() {
        if (dateAdded == null) {
            dateAdded = new LocalDateFilter();
        }
        return dateAdded;
    }

    public void setDateAdded(LocalDateFilter dateAdded) {
        this.dateAdded = dateAdded;
    }

    public LocalDateFilter getDateModified() {
        return dateModified;
    }

    public LocalDateFilter dateModified() {
        if (dateModified == null) {
            dateModified = new LocalDateFilter();
        }
        return dateModified;
    }

    public void setDateModified(LocalDateFilter dateModified) {
        this.dateModified = dateModified;
    }

    public LongFilter getCategoryId() {
        return categoryId;
    }

    public LongFilter categoryId() {
        if (categoryId == null) {
            categoryId = new LongFilter();
        }
        return categoryId;
    }

    public void setCategoryId(LongFilter categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ProductCriteria that = (ProductCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(title, that.title) &&
            Objects.equals(keywords, that.keywords) &&
            Objects.equals(description, that.description) &&
            Objects.equals(rating, that.rating) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateModified, that.dateModified) &&
            Objects.equals(categoryId, that.categoryId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, keywords, description, rating, dateAdded, dateModified, categoryId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (title != null ? "title=" + title + ", " : "") +
            (keywords != null ? "keywords=" + keywords + ", " : "") +
            (description != null ? "description=" + description + ", " : "") +
            (rating != null ? "rating=" + rating + ", " : "") +
            (dateAdded != null ? "dateAdded=" + dateAdded + ", " : "") +
            (dateModified != null ? "dateModified=" + dateModified + ", " : "") +
            (categoryId != null ? "categoryId=" + categoryId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
