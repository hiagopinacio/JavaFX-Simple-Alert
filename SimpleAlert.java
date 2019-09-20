/*
 * The MIT License
 *
 * Copyright 2019.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package modelo;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
    
/**
 *
 * @author Hiago Paiva Inácio - hiagopinacio@gmail.com
 */
public class SimpleAlert {
    
    /**
     * Show a warning dialog with header text, content text
     * @param header header text.
     * @param msg content text.
     */
    public static void error (String header, String msg) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Error");
        a.setHeaderText(header);
        a.setContentText(msg);
        a.showAndWait();
    }
    
    /**
     * Show a warning dialog with header text, content text
     * @param header header text.
     * @param msg content text.
     */
    public static void info (String header, String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information");
        a.setHeaderText(header);
        a.setContentText(msg);
        a.showAndWait();
    }
    
    /**
     * Show a warning dialog with header text, content text
     * @param header header text.
     * @param msg content text.
     */
    public static void warning (String header, String msg) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warnig");
        a.setHeaderText(header);
        a.setContentText(msg);
        a.showAndWait();
    }
    
    
    /**
     * Show a confirmation dialog with header text, content text and buttons OK and CANCEL.
     * @param header header text.
     * @param msg content text.
     * @return
     *  <code>true</code> if clicked the OK button.
     *  <code>false</code> if clicked CANCEL button or closed the dialog.
     */
    public static boolean confirmation (String header, String msg) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmation");
        a.setHeaderText(header);
        a.setContentText(msg);
        Optional<ButtonType> result = a.showAndWait();
        return result.get() == ButtonType.OK;
    }
    
}
