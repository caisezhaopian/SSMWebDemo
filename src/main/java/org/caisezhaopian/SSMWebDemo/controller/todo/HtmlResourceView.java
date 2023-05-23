package org.caisezhaopian.SSMWebDemo.controller.todo;

import java.io.File;
import java.util.Locale;
import java.util.Objects;

import org.springframework.web.servlet.view.InternalResourceView;

public class HtmlResourceView extends InternalResourceView{
    @Override
    public boolean checkResource(Locale locale) {
        File file = new File(Objects.requireNonNull(this.getServletContext()).getRealPath("/")+getUrl());
        return file.exists();
    }
}