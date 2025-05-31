# PALM Evaluation

This branch evaluates our model using predefined configurations and replicates our experiments five times.

## Requirements

- Python 3.8+
- An OpenAI API key

## Setup

Before running the script, set your OpenAI API key as an environment variable:

```bash
export OPENAI_API_KEY=replace_with_your_key_here
```

## Run the Evaluation

Once the key is set, run:

```bash
python -m testMaker.eval.eval 1 2 3 4 5
```

This command executes five evaluation runs with different configurations to reproduce our experiments.
