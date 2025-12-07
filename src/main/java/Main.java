import io.github.doblon8.qrcode.QrDecoder;

import java.awt.image.BufferedImage;

import static java.lang.IO.println;

void main() {
    var image = new BufferedImage(100, 100, BufferedImage.TYPE_BYTE_GRAY);
    var decoder = new QrDecoder();
    var result = decoder.decode(image);
    println("Decoded QR: " + result);
}