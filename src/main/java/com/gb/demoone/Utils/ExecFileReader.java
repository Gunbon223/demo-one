package com.gb.demoone.Utils;

import com.gb.demoone.Model.Book;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class ExecFileReader implements IFileReader{
    @Override
    public List<Book> readFile(String path) {
        List<Book> books = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(path));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            while (rows.hasNext()) {
                Row currentRow = rows.next();
                Iterator<Cell> cellsInRow = currentRow.iterator();

                Book book = new Book();
                if (cellsInRow.hasNext()) {
                    Cell idCell = cellsInRow.next();
                    book.setId(idCell.getStringCellValue());
                }
                if (cellsInRow.hasNext()) {
                    Cell titleCell = cellsInRow.next();
                    book.setTitle(titleCell.getStringCellValue());
                }
                if (cellsInRow.hasNext()) {
                    Cell authorCell = cellsInRow.next();
                    book.setAuthor(authorCell.getStringCellValue());
                }
                if (cellsInRow.hasNext()) {
                    Cell yearCell = cellsInRow.next();
                    book.setYear((int) yearCell.getNumericCellValue());

                }

                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}