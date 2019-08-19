package Command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommandReader {

  private Scanner scanner;

  public CommandReader(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    scanner = new Scanner(file);
  }

  public void readCommands() {

  }

}
