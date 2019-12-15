import unittest

from python.src.util.hashset import HashSet
from python.src.util.radix_trie_map import RadixTrieMap


class RadixTrieMapTest(unittest.TestCase):

    def setUp(self):
        self.map = RadixTrieMap()

    def test_clear(self):
        self.map.put("go", True)

        self.assertEqual(1, self.map.size())
        self.assertFalse(self.map.is_empty())

        self.map.clear()

        self.assertEqual(0, self.map.size())
        self.assertTrue(self.map.is_empty())
        self.assertFalse(self.map.contains("go"))

    def test_size_is_empty(self):
        self.assertTrue(self.map.is_empty())
        self.assertEqual(0, self.map.size())

        self.map.put("go", False)
        self.map.put("gone", True)

        self.assertEqual(2, self.map.size())
        self.assertFalse(self.map.is_empty())

    def test_contains(self):
        self.map.put("go", True)
        self.map.put("going", True)

        self.assertTrue(self.map.contains("go"))
        self.assertTrue(self.map.contains("going"))

        self.assertFalse(self.map.contains("gotten"))
        self.map.put("gotten", True)
        self.assertTrue(self.map.contains("gotten"))

    def test_get_nonexistant(self):
        self.assertIsNone(self.map.get("gone"))

        self.map.put("gone", True)
        self.assertIsNone(self.map.get("go"))
        self.assertIsNotNone(self.map.get("gone"))

    def test_put_duplicate_overwrite(self):
        self.map.put("go", True)
        self.map.put("gone", True)
        self.assertTrue(self.map.get("go"))
        self.assertTrue(self.map.get("gone"))

        self.map.put("go", False)
        self.assertFalse(self.map.get("go"))
        self.assertTrue(self.map.get("gone"))

    def test_starts_with(self):
        self.map.put("go", True)
        self.map.put("going", True)
        self.map.put("gone", True)
        self.map.put("gong", True)
        self.map.put("gonna", True)
        self.map.put("gown", True)

        words = self.map.starts_with("gon")
        self.assertEqual(3, words.size())
        self.assertTrue(words.contains("gone"))
        self.assertTrue(words.contains("gong"))
        self.assertTrue(words.contains("gonna"))

    def test_sorted(self):
        self.map.put("go", True)
        self.map.put("going", True)
        self.map.put("gone", True)
        self.map.put("house", True)
        self.map.put("ephemeris", True)
        self.map.put("eikons", True)
        self.map.put("nail", True)
        self.map.put("sick", True)
        self.map.put("sikkimese", True)
        self.map.put("marylanders", True)
        self.map.put("unparasitically", True)
        self.map.put("unbuttressed", True)
        self.map.put("solemnest", True)
        self.map.put("escalades", True)
        self.map.put("devoration", True)
        self.map.put("weight", True)
        self.map.put("vice", True)
        self.map.put("begotten", True)
        self.map.put("pugil", True)
        self.map.put("assurgent", True)
        self.map.put("podsnappery", True)
        self.map.put("poet", True)
        self.map.put("dramatist", True)
        self.map.put("leonese", True)
        self.map.put("wreathy", True)

        actual = []
        sorted = []

        for word in self.map.sorted():
            actual.append(word)
            sorted.append(word)

        sorted.sort()

        self.assertEqual(sorted, actual)


if __name__ == '__main__':
    unittest.main()
