import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Tests {

  private static String[] names = new String[]{"Brian", "Marilyn", "Pamela", "Timothy", "Jesse", "Heather", "Terry", "Carlos",
          "Bonnie", "Randy", "Lillian", "Emily", "Louis", "Chris", "Howard", "Helen", "Ralph", "Jennifer", "Mark", "Laura",
          "Jason", "Shirley", "Diane", "Phillip", "David", "Joan", "Wanda", "Jimmy", "Carl", "Betty", "Adam", "Lawrence",
          "Kathleen", "Mildred", "Rose", "Tina", "Jose", "Keith", "Janice", "Maria", "Kenneth", "Arthur", "James", "Catherine",
          "Henry", "Denise", "Ruby", "Cynthia", "Anthony", "Jeffrey", "Eugene", "Dorothy", "Lori", "Bobby", "Peter", "Alice",
          "Eric", "Wayne", "Phyllis", "Roger", "Clarence", "Scott", "John", "Philip", "Teresa", "Andrea", "Douglas", "Earl",
          "Melissa", "Benjamin", "Rebecca", "Michelle", "Alan", "Brenda", "William", "Frank", "Matthew", "George", "Anna",
          "Cheryl", "Roy", "Paula", "Tammy", "Gerald", "Christina", "Russell", "Kelly", "Albert", "Donna", "Todd", "Jessica",
          "Kimberly", "Johnny", "Dennis", "Jack", "Doris", "Martha", "Stephanie", "Stephen", "Christine"};

  @Test
  public void staticTests() {
    assertEquals("no one likes this", LikesFormatter.likes());
    System.out.println(LikesFormatter.likes());
    assertEquals("Peter likes this", LikesFormatter.likes("Peter"));
    System.out.println(LikesFormatter.likes("Peter"));
    assertEquals("Jacob and Alex like this", LikesFormatter.likes("Jacob", "Alex"));
    System.out.println(LikesFormatter.likes("Jacob", "Alex"));
    assertEquals("Max, John and Mark like this", LikesFormatter.likes("Max", "John", "Mark"));
    System.out.println(LikesFormatter.likes("Max", "John", "Mark"));
    assertEquals("Alex, Jacob and 2 others like this", LikesFormatter.likes("Alex", "Jacob", "Mark", "Max"));
    System.out.println(LikesFormatter.likes("Alex", "Jacob", "Mark", "Max"));
    assertEquals("Brian, Marilyn and 98 others like this", LikesFormatter.likes(names));
    System.out.println(LikesFormatter.likes(names));
  }

}