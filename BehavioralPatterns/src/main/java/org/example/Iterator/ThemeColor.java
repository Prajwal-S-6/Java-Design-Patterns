package org.example.Iterator;

//This enum represents the aggregate from iterator pattern
public enum ThemeColor {

	RED,
	ORANGE,
	GREEN,
	BLACK,
	WHITE;

	public static Iterator<ThemeColor> getIterator() {
		return new ThemeColorIterator();
	}

	static class ThemeColorIterator implements Iterator<ThemeColor> {

		private int position;

		@Override
		public boolean hasNext() {
			return position < ThemeColor.values().length;
		}

		@Override
		public ThemeColor next() {
			return ThemeColor.values()[position++];
		}
	}

}

