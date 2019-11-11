import unittest
from string import ascii_lowercase

from python.src.app.spellchecker import SpellChecker
from python.src.util.hashset import HashSet


class SpellCheckerTest(unittest.TestCase):

    def setUp(self):
        words = HashSet()

        words.add("apple")
        words.add("camel")
        words.add("cat")
        words.add("dog")
        words.add("home")
        words.add("quiesce")
        words.add("royal")

        self.spellchecker = SpellChecker(words)

    def test_correctly_spelled(self):
        for word in self.spellchecker.words:
            self.assertTrue(self.spellchecker.is_correctly_spelled(word))

    def test_suggestinos_add_start_character(self):
        for word in self.spellchecker.words:
            misspelled = word[1:]
            self.assertTrue(
                self.spellchecker.get_suggestions(misspelled).contains(word))

    def test_suggestions_add_end_character(self):
        for word in self.spellchecker.words:
            misspelled = word[:-1]
            self.assertTrue(
                self.spellchecker.get_suggestions(misspelled).contains(word))

    def test_suggestions_remove_start_character(self):
        for word in self.spellchecker.words:
            for c in ascii_lowercase:
                self.assertTrue(
                    self.spellchecker.get_suggestions(c + word).contains(word))

    def test_suggestions_remove_end_character(self):
        for word in self.spellchecker.words:
            for c in ascii_lowercase:
                self.assertTrue(
                    self.spellchecker.get_suggestions(word + c).contains(word))

    def swap(self, word, i, j):
        temp = word[i]
        word[i] = word[j]
        word[j] = temp

    def test_suggestions_exchange_adjacent_characters(self):
        for word in self.spellchecker.words:
            elements = list(word)
            for i in range(1, len(elements)):
                self.swap(elements, i, i - 1)

                candidate = ''.join(elements)
                self.assertTrue(
                    self.spellchecker.get_suggestions(candidate).contains(word))

                self.swap(elements, i - 1, i)


if __name__ == '__main__':
    unittest.main()
