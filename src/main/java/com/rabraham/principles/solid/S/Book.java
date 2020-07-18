package com.rabraham.principles.solid.S;

import java.util.List;

public interface Book {
    List<Page> pagesWithText(String text);

    void addPage(Page page);
}
