from collections import defaultdict
import re

class NextWordPredictor:
    def __init__(self, n):
        self.n = n  # n-gram size
        self.ngrams = defaultdict(list)

    def train(self, text):
        words = re.findall(r'\b\w+\b', text.lower())  # Tokenize text into words
        for i in range(len(words) - self.n):
            prefix = tuple(words[i:i + self.n])  # Extract n-gram prefix
            next_word = words[i + self.n]  # Extract next word
            self.ngrams[prefix].append(next_word)  # Add next word to n-gram dictionary

    def predict(self, prefix):
        return self.ngrams[prefix] if prefix in self.ngrams else []

def main():
    # Example text for training
    text = "I like to eat pizza. Pizza is delicious. I want pizza now."

    # Initialize predictor with n-gram size of 2
    predictor = NextWordPredictor(n=2)

    # Train the predictor
    predictor.train(text)

    # Predict next word given a prefix
    prefix = ('i', 'like')
    next_words = predictor.predict(prefix)

    if next_words:
        print("sudhanshu: Next word predictions for prefix '{}':".format(' '.join(prefix)))
        print(next_words)
    else:
        print("No predictions available for the given prefix.")

if __name__ == "__main__":
    main()
