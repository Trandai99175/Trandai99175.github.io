package btvn8;

public class SerialSevice {

    public Serial[] getSerials() {
        Serial[] serials = new Serial[]{
                new Serial (1, "Những người khốn khổ", "Bùi Hiên", "tiểu thuyết", "12/5/2022", 5, "1H30"),
                new Serial (2, "Đắc nhân tâm", "Tô Hoài", "trinh thám", "12/5/2022", 7, "1H40"),
                new Serial (3, "Deep work", "Thu Hằng", "tiểu thuyết", "13/5/2022", 56, "1H50"),
                new Serial (4, "Rèn luyện tư duy phản biện", "Minh Duy", "tiểu thuyết", "15/5/2022", 8, "2H30"),
                new Serial (5, "Nghìn lẻ một đêm", "Minh Trí", "tiểu thuyết", "16/5/2022", 9, "2H10"),

        };
        return serials;
    }

    public void findByTitle(String title) {
        int count = 0;
        for (Serial serial : getSerials ( )) {
            if (serial.title.contains (title)) {
                count++;
                System.out.println (serial);
            }
        }
        if (count == 0) {
            System.out.println ("Không có sách phù hợp Serial với tên là : " + title);
        }
    }


}
