import unittest

from python.src.app.plagiarism_detector import PlagiarismDetector


class PlagiarismDetectorTest(unittest.TestCase):

    def setUp(self):
        self.pd = PlagiarismDetector()
        self.pd.add_search_text(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor "
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
            "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure "
            "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
            "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia "
            "deserunt mollit anim id est laborum.")

    def test_plagiarized(self):
        self.assertTrue(self.pd.is_plagiarized("duis aute irure"))

    def test_plagiarized_across_sentences(self):
        self.assertTrue(
            self.pd.is_plagiarized("pariatur. Excepteur sint occaecat"))
        self.assertTrue(
            self.pd.is_plagiarized("pariatur Excepteur sint occaecat"))

    def test_not_plagiarized(self):
        self.assertFalse(self.pd.is_plagiarized("obviously not plagiarized"))


if __name__ == '__main__':
    unittest.main()
