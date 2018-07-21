package tests;

public enum Separator {
	PERIOD {
		@Override
		public String toString() {
			return "\\.";
		}
	},
	HASH {
		@Override
		public String toString() {
			return "#";
		}
	}

}
