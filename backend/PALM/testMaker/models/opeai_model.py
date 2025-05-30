from PALM.testMaker.models.model import Model
import openai
class OpenaiModel(Model):
    def __init__(self, model_name):
        super().__init__(model_name)
        self.temperature_allowed_models = ["gpt-4o", "gpt-4-turbo", "gpt-4", "gpt-3.5-turbo"]
    
    def generate(self, prompt):
        if self.model_name not in self.temperature_allowed_models:
            for iter in range(0, self.max_trial):
                try:
                    response = openai.chat.completions.create(
                        model=self.model_name,
                        messages=[
                            {"role": "system", "content": "You are a helpful assistant proficient in symbolic execution-based test generation for Java."},
                            {"role": "user", "content": prompt}
                        ]
                    )
                    
                    return response.choices[0].message.content.strip()
                except Exception as e:
                    if iter == self.max_trial - 1:
                        # Raise the exception if it is the last trial
                        raise e
            assert False, "Failed to generate response after 5 trials."
        else:
            for iter in range(0, self.max_trial):
                try:
                    response = openai.chat.completions.create(
                        model=self.model_name,
                        messages=[
                            {"role": "system", "content": "You are a helpful assistant proficient in symbolic execution-based test generation for Java."},
                            {"role": "user", "content": prompt}
                        ],
                        temperature=0.5
                    )
                    
                    return response.choices[0].message.content.strip()
                except Exception as e:
                    if iter == self.max_trial - 1:
                        # Raise the exception if it is the last trial
                        raise e
            assert False, "Failed to generate response after 5 trials."