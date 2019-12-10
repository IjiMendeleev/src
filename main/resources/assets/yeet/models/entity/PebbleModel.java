package assets.afiajar.models.entity;
//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class PebbleModel extends ModelBase {
	private final ModelRenderer group;
	private final ModelRenderer bone;

	public PebbleModel () {
		textureWidth = 16;
		textureHeight = 16;

		group = new ModelRenderer(this);
		group.setRotationPoint(-12.8F, 13.9F, 16.6F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.0F, -8.0F, -3.0F, 2, 7, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.0F, -8.0F, -3.0F, 2, 0, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.8F, -8.8F, -3.0F, 1, 0, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.0F, -8.8F, -1.2F, 1, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.2F, -7.8F, -1.0F, 0, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.2F, -6.8F, -0.8F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.0F, -8.8F, -3.0F, 0, 0, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -3.0F, -1.0F, -5.0F, 6, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, 3.0F, -2.0F, -5.0F, 0, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -3.5F, -2.0F, -5.0F, 0, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -3.0F, -2.0F, 1.0F, 6, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -3.0F, -2.0F, -5.5F, 6, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.3F, -3.0F, 1.0F, 0, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.3F, -4.0F, 2.0F, 0, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.3F, -2.0F, 1.0F, 0, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.3F, -3.0F, 3.0F, 0, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.0F, -2.0F, -1.0F, 2, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.0F, -2.0F, -3.1F, 2, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -1.1F, -2.0F, -3.0F, 0, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, 1.0F, -2.0F, -3.0F, 0, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -0.2F, -9.0F, -2.1F, 0, 0, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
		bone.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}