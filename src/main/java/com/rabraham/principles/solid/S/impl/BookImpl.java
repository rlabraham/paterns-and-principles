package com.rabraham.principles.solid.S.impl;

import com.rabraham.principles.solid.S.Book;
import com.rabraham.principles.solid.S.Page;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
/**
 * Single Responsibility - a class should only have one responsibility. Furthermore, it should only have one reason to change.
 */
public class BookImpl implements Book {
    private String title;
    private String author;

    @NonNull
    private List<Page> pages;

    @Override
    public String toString() {
        return this.title + " by " + this.author + " - " + this.pages.size() + " pages";
    }

    public List<Page> pagesWithText(String text) {
        final List<Page> pagesContainingText = new ArrayList<>();

        for (final Page page : this.pages) {
            if (page.containsText(text)) {
                pagesContainingText.add(page);
            }
        }

        return pagesContainingText;
    }

    public void addPage(final Page page) {
        this.pages.add(page);
    }
}
