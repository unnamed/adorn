package team.unnamed.adorn.reader;

import team.unnamed.adorn.Overlay;
import team.unnamed.creative.base.Readable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@FunctionalInterface
public interface OverlayReader {

    Overlay read(InputStream input) throws IOException;

    default Overlay read(Readable readable) throws IOException {
        try (InputStream input = readable.open()) {
            return read(input);
        }
    }

    default Overlay read(File file) throws IOException {
        try (InputStream input = new FileInputStream(file)) {
            return read(input);
        }
    }

}
