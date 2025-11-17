/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

import io.github.doblon8.qrcode.QrDecoder;

import java.awt.image.BufferedImage;

import static java.lang.IO.println;

void main() {
    var image = new BufferedImage(100, 100, BufferedImage.TYPE_BYTE_GRAY);
    var decoder = new QrDecoder();
    var result = decoder.decode(image);
    println("Decoded QR: " + result);
}