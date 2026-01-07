package com.spiegel.scores352.presentation.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.data.domain.Page;

public class PaginatedResponse<T> {
    @JsonProperty("totalPages")
    private int totalPages;
    
    @JsonProperty("totalElements")
    private Long totalElements;
    
    @JsonProperty("pageSize")
    private int pageSize;
    
    @JsonProperty("content")
    private List<T> content;
    
    public PaginatedResponse(Page page) {
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.content = page.getContent();
        this.pageSize = page.getNumberOfElements();
    }
}
