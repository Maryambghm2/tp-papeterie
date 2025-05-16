package org.example.classes;

public class Article {
    private long reference;

    public Article(long reference) {
        this.reference = reference;
    }
    public long getReference() {
        return reference;
    }

    public void setReference(long reference){
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Article{" +
                "reference=" + reference +
                '}';
    }

    public static void main(String[] args) {
    Article article = new Article(486572003);
        System.out.println(article.getReference());
    }
}
