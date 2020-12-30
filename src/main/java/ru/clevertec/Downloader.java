package ru.clevertec;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class Downloader implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("downloader", DownloaderExtension.class);
    }
}
