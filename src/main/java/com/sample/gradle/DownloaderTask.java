package com.sample.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskExecutionException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


public class DownloaderTask extends DefaultTask {
    @TaskAction
    public void downloaderTasks() throws TaskExecutionException {
        DownloaderExtension extension = getProject().getExtensions().findByType(DownloaderExtension.class);
        try {
            URL filePath = new URL(extension.getPdfTemplate());
            ReadableByteChannel rbc = Channels.newChannel(filePath.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(extension.getFilePath());
            fileOutputStream.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            System.err.println();
        }

    }
}
