package com.rabraham.principles.solid;

import java.util.List;

public interface Book {
    List<Page> pagesWithText(String text);

    void addPage(Page page);
}
