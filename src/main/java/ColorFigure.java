interface AddColor {
    void addColor(String color);
}

interface RemoveColor {
    void removeColor();
}

interface ReplaceColor {
    void replaceColor(String color);
}

interface ColorFigure extends AddColor, RemoveColor, ReplaceColor {
    void printColor();
}
