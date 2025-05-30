"""
This class converts a list of complete paths into a symbolic tree.
 - all input paths from the path extractor are complete paths (leaf nodes), a sequence of instructions
 - build intermediate nodes
 - only intermediate nodes that have (>=2) children are kept
 - further support test generation, with feasbility check on intermediate nodes
"""
class SymbolicTree:
    pass