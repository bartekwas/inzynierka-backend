package pl.lukaszdutka.tags;

public class ChapterTag extends Tag {

    private int chapterNumber;

    ChapterTag(String key, int chapterNumber) {
        super(key, "Chapter");
        this.chapterNumber = chapterNumber;
    }

    @Override
    public String getStory() {
        return value + " " + chapterNumber + ".";
    }

    @Override
    public boolean isChapter() {
        return true;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }
}
