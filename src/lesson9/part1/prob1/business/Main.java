package lesson9.part1.prob1.business;

import lesson9.part1.prob1.dataaccess.DataAccess;
import lesson9.part1.prob1.dataaccess.DataAccessFacade;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(allWhoseZipContains3());
        System.out.println(allHavingAtLeastTwoCopies());
        System.out.println(allHavingMultipleAuthors());


    }

    //Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
    public static List<String> allWhoseZipContains3() {
        DataAccess da = new DataAccessFacade();
        return da
                .readMemberMap()
                .values()
                .stream()
                .map(LibraryMember::getMemberId)
                .filter(memberId -> memberId.contains("3"))
                .toList();
    }

    //Returns a list of all isbns of books having at least two copies
    public static List<String> allHavingAtLeastTwoCopies() {
        DataAccess da = new DataAccessFacade();
        return da
                .readBooksMap()
                .values()
                .stream()
                .filter(e -> e.getNumCopies() >= 2)
                .map(Book::getIsbn)
                .toList();
    }

    //Returns a list of all isbns of  Books that have multiple authors
    public static List<String> allHavingMultipleAuthors() {
        DataAccess da = new DataAccessFacade();
        return da
                .readBooksMap()
                .values()
                .stream()
                .filter(e -> e.getAuthors().size() > 1)
                .map(Book::getIsbn)
                .toList();

    }
}
